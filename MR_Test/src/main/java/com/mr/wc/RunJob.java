package com.mr.wc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public class RunJob {
    public static void main(String[] args) {
        Configuration conf = new Configuration();

        //设置hdfs的通讯地址
        conf.set("fs.defaultFS", "hdfs://node1:8020");
        //设置RN的主机
        conf.set("yarn.resourcemanager.hostname", "node1");
        try {
            FileSystem fs = FileSystem.get(conf);


            Job job = Job.getInstance(conf);
            job.setJarByClass(RunJob.class);

            job.setJobName("wc");

            job.setMapperClass(WordCountMapper.class);
            job.setReducerClass(WordCountReducer.class);

            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(IntWritable.class);

            FileInputFormat.addInputPath(job, new Path("/usr/input/"));

            Path outpath = new Path("/usr/output/wc");
            if (fs.exists(outpath)) {
                fs.delete(outpath, true);
            }
            FileOutputFormat.setOutputPath(job, outpath);

            boolean f = job.waitForCompletion(true);
            if (f) {
                System.out.println("job??????г??");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

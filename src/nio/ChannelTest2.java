package nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class ChannelTest2 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile=new RandomAccessFile("C:\\Users\\ocean\\Desktop\\001.txt","rw");
        FileChannel resource = randomAccessFile.getChannel();

        RandomAccessFile randomAccessFile1 = new RandomAccessFile("C:\\Users\\ocean\\Desktop\\002 .txt","rw");
        FileChannel direct = randomAccessFile1.getChannel();
        //直接从一个channel传输文件到另一个文件
        long position=0;
        long size=resource.size();
        direct.transferFrom(resource,position,size);
        resource.close();
        direct.close();
    }
}

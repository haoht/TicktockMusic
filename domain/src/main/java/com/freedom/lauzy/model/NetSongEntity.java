package com.freedom.lauzy.model;

/**
 * Desc : 播放 Bean，经 mapper 转换，可即时增添修改
 * Author : Lauzy
 * Date : 2017/9/6
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public class NetSongEntity {

    public String artistId; //歌手ID
    public String imgUrl; //图片链接
    public String lrcLink; //歌词路径
    public String info; //额外信息
    public String songId; //歌曲ID
    public String title; //名称
    public String tingUid; //歌手信息ID
    public String author; //作者
    public String albumId; //专辑ID
    public String albumTitle; //专辑标题
    public String artistName; //歌手名字
    public String size;//大小
    public long duration;//时长
    public String songLength;//时长(格式化)
    public String playPath;//播放路径
}

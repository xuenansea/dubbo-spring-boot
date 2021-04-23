## windows下nacos-server安装单体服务处理
    
    1、在自己的mysql数据库中新建一个数据库，名字为nacos
    
    2、在nacos数据库下执行在刚解压的conf目录下的nacos-mysql.sql文件，会添加一些表
    
    3、修改conf目录下的application.properties，内容如下（即连接mysql数据库的连接配置）：
    ### Count of DB:
    db.num=1
    ### Connect URL of DB:
    db.url=jdbc:mysql://127.0.0.1:3306/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
    db.user=root
    db.password=123456

    4、修改bin目录下的startup.cmd文件，内容如下（修改nacos的部署模式为单机模式）：
       将 “ set MODE="cluster" ”改为 “ set MODE="standalone" ”
       
    5、用户名和密码默认都是 : nacos

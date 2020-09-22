### Nacos 编译命令 :    
#### mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U 
###Windows 不要在PowerShell 中运行

#### (这步不用做. 我已将编译的源sh&bat 改为单机模式) 编译之后 解压 tar.gz 时 如果是单机一定要把startup 改为 standalone 单机模式 !! 或 startup.sh -m standalone 启动
 [Nacos 官方文档 (ZH-CN)](https://nacos.io/zh-cn/docs/what-is-nacos.html)
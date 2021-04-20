package designpatterns.proxy;

public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    public String doSearch (String userId, String keyword){
        // 如果身份验证成功
        if (this.validate(userId)){
            String result = searcher.doSearch(userId,keyword);

            this.log(userId);
            return result;
        }
        else {
            return null;
        }
    }

    // 创建访问验证对象并调用其validate()方法实现身份验证
    public boolean validate(String userId){
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象并调用其log()方法实现日志记录
    public void log(String userId){
        logger= new Logger();
        logger.log(userId);
    }
}

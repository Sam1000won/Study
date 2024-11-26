package admin.Service;

@Serviece
public class MainService {
    Logger logger = LoggerFactory.getLogger(getClass())
    @Autowired MainDAO main_dao;

    //layout
    public String getname(String admin_idx){
        return main_dao.getname(admin_idx);
    }
    // 로그인
    public String login(String admin_id,String pw){
        String result = "";
        if (mian_dao.login(admin_id,pw)==1){
            result = "pass";
        } else if (main_dao.checkid(admin_id) == 0){
            result = "invaliDTO";
        } else{
            result = "invalidPW";
        }
        return result;

    }
    public int getidx(Stirng admin_id){}
}

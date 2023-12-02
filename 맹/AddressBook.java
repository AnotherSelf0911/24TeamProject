import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AddressBook {


    HashMap<String,User> hash = new HashMap<String,User>();


    public void add(User user){
        hash.put(user.getName(),user);
        System.out.println(user.getName()+"이 추가되었습니다.");
    }
    public void remove(String n){
        if(hash.containsKey(n)){
            hash.remove(n);
            System.out.println(n+"이 삭제되었습니다.");
        }else{
            System.out.println(n+"은(는) 없는 사용자입니다");
        }
    }

    public void  showUserAll(){

        if(hash.isEmpty()) {
            System.out.println("등록된 정보가 없습니다.");
        }else {
            System.out.println("주소록에 저장된 모든 사용자:");
            for (User user : hash.values()) {
                System.out.println(user);
            }
        }
    }
    public void showUser(String n){
        Set<String> keySet = hash.keySet();
        Iterator<String> keyIt = keySet.iterator();

        while(keyIt.hasNext()){
            String key=keyIt.next();
            if(key.equals(n)){
                User user = hash.get(key);
                System.out.println(n+"사용자 님의 정보입니다.");
                System.out.println(user);
            }





        }





    }





}


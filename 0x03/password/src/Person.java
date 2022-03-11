public class Person {

    public Person() {
    }

    public boolean checkUser(String nome){
       return nome.length() >=8 && nome.matches("[a-zA-Z].*[a-zA-Z0-9]");
    }

    public boolean checkPassword(String senha){
        return senha.length() >=8 && senha.matches("(?=.*[}{,.@$^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9]).{8,}");
    }

}

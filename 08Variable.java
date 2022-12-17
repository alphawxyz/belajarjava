public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Adi Kurniawan";   //Contoh inisialisasi tidak langsung

        int age = 20;
        String address = "Kebumen";  //Inisalisasi langsung

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        //Contoh kalau ingin mengganti
        name = "Adi Wiliams";
        System.out.println(name);  //bisa karena java membaca dari bawah

        //Kata kunci var
        var fullname = "Adi Kurniawan";
        System.out.println(fullname);

        //Kata Kunci Final
        final String application = "Belajar Java";
        System.out.println(application);
    }
}

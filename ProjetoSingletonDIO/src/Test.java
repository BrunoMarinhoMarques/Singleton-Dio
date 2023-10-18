public class Test {
    public static void main(String[] args) {
        
        //Testes Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        //eles imprimem o mesmo endereço de memoria, mesmo criando uma intancia
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        
        //eles imprimem o mesmo endereço de memoria, mesmo criando uma intancia
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }
}

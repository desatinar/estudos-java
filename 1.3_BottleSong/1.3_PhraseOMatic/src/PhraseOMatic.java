import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) throws Exception {
        String[] wordlListOne = {"agnóstico", "opinativo", "ativado por voz", "orientado a feedback tátil", "extensível", "reativo", "baseado em agentes", "funcional", "habilitado por IA", "fortemente tipado"};
        
        String[] wordListTwo = {"fracamente acoplado", "Six Sigma", "assíncrono", "orientado a eventos", "pub-sub", "IoT", "nativo em nuvem", "orientado a serviços", "containerizado", "serverless", "microsserviços", "livro-razão distribuído"};
        
        String[] wordListThree = {"framework", "biblioteca", "DSL", "API REST", "repositório", "pipeline", "service mesh", "arquitetura", "perspectiva", "design", "orientação"};

        int oneLength = wordlListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        Random randonGenerator = new Random();
        
        int rand1 = randonGenerator.nextInt(oneLength);
        int rand2 = randonGenerator.nextInt(twoLength);
        int rand3 = randonGenerator.nextInt(threeLength);
        String phrase = wordlListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        System.out.println("Precisamos de " + phrase);
    }
}

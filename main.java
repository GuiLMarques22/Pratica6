package Exercicio3;

public class main {

Edicao edicao = new Edicao(1, 1, "01/05/2023", 1000, artigos);

ArrayList<Edicao> edicoes = new ArrayList<>();
edicoes.add(edicao);
RevistaCientifica revista = new RevistaCientifica("Revista Científica", 123456789, "Mensal", edicoes);

System.out.println("Titulo da revista: " + revista.getTitulo());
System.out.println("ISSN: " + revista.getIssn());
System.out.println("Periodicidade: " + revista.getPeriodicidade());
System.out.println("Numero da edicao: " + revista.getEdicoes().get(0).getNumero());
System.out.println("Volume: " + revista.getEdicoes().get(0).getVolume());
System.out.println("Data de edicao: " + revista.getEdicoes().get(0).getDataEdicao());
System.out.println("Tiragem: " + revista.getEdicoes().get(0).getTiragem());
System.out.println("Quantidade de artigos: " + revista.getEdicoes().get(0).getArtigos().size());


}

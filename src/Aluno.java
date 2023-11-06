
import javax.swing.JOptionPane;



/**
 *
 * @author thiag
 */
public class Aluno {
    private String nome;
    private int rgm;
    private String disciplina;
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getRgm(){
        return rgm;
    }
    
    public void setRgm(int rgm){
        this.rgm = rgm;
    }
    
   public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    
    }
    
    public double calcularMedia(double nota1,double nota2){
        return (nota1 + nota2)/2;
    }
    
     public double calcularFrequencia(double Naulas, double Nfaltas){
         return 100 - (Nfaltas * 100 / Naulas);
     }

     public String situacaoFinal(double media, double frequencia){
         if (frequencia <75){
             return "Reprovado!";
     }
     if (media <3){
         return "Reprovado!";
     }
     if (media <7){
         return "Exame!";
     }
     return "Aprovado!";
     }
}
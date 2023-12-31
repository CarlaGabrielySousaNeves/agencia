package br.com.senai;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class App 
{
    public static void main( String[] args ) {
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato yasmin = new Candidato();
        yasmin.nomeCompleto = "Yasmin Carvalho da Silva";
        yasmin.dataNascimento = LocalDate.of(2000, 10, 16);
        yasmin.email = "yasmincarvalho@gmail.com";
        yasmin.genero = Genero.F;
        yasmin.naturalidade = Estado.PI.toString();
        yasmin.nacionalidade = "Brasil";
        yasmin.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Sistema para Internet";
        e1.nomeInstituicao = "SENAI";
        e1.dataInicio = LocalDate.of(2022, 10, 01);
        e1.dataFim = LocalDate.of(2023, 06, 10);

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Engenharia Civil";
        e2.nomeInstituicao = "IFPI";
        e2.dataInicio = LocalDate.of(2020, 02, 01);
        e2.dataFim = LocalDate.of(2023, 06, 10);

        yasmin.escolaridades = Arrays.asList(e1, e2);

        Candidato mirelle = new Candidato();
        mirelle.nomeCompleto = "Mirelle Silva";
        mirelle.dataNascimento = LocalDate.of(2007, 12, 18);

        System.out.println("Nome Completo: " +yasmin.nomeCompleto);
        System.out.println("Idade: "+yasmin.calcularidade());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("Nome Completo: " +mirelle.nomeCompleto);
        System.out.println("Idade: "+mirelle.calcularidade());

        for (Escolaridade escolaridade : yasmin.escolaridades) {
            System.out.println(escolaridade.nomeCurso+" - "+escolaridade.nomeInstituicao);
        }
    }
}

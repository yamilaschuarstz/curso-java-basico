public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Billie");
        //contato.setEndereco("Rua de Baixo");
        //contato.setTelefone("9999-9999");

        //Criar endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua de Baixo");
        end.setNumero("777");
        end.setCidade("Koln");
        end.setEstado("Vestfalia");
        end.setComplemento("-");
        end.setCep("99999-0000");

        contato.setEndereco(end);

        //Criar telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("01");
        tel.setNumero("9998-9998");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Casa");
        tel2.setDdd("01");
        tel2.setNumero("7777-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        System.out.println("Nome: " + contato.getNome());
        if (contato != null && contato.getEndereco() != null){
            System.out.println("Endereço: " + contato.getEndereco().getCidade());

        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone telefone : contato.getTelefones()){
                System.out.println("Telefone: " + telefone.getDdd() + "-" + telefone.getNumero());
            }
        }
    }
}

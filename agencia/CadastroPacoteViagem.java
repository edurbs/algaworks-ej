package agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);
        if (pacotes.contains(pacote)) {
            throw new PacoteViagemException("Pacote já existe");
        }
        pacotes.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return List.copyOf(pacotes);
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PrecoComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean nothingRemoved = true;
        for (PacoteViagem pacote : pacotes) {
            if (descricao.equals(pacote.getDescricao())) {
                remover(pacote);
                nothingRemoved=false;
            }
        }
        if (nothingRemoved) {
            throw new PacoteViagemException("Não foi encontrado nenhum pacote com este nome para remover");
        }
    }

    private void remover(PacoteViagem pacote) {
        if (!pacotes.remove(pacote)) {
            throw new PacoteViagemException("Não foi possível remover o pacote");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }
        throw new PacoteViagemException("Nenhuma descrição foi encontrada");
    }

}
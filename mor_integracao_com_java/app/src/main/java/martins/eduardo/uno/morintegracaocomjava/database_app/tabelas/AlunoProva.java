package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_alunoprova"
        , primaryKeys = {"aluno_id", "prova_id"}
        , indices = {@Index(value = {"aluno_id"}), @Index(value = {"prova_id"})}
        , foreignKeys = {@ForeignKey(entity = Aluno.class, parentColumns = "id",
            childColumns = "aluno_id", onUpdate = CASCADE, onDelete = CASCADE)
                , @ForeignKey(entity = Prova.class, parentColumns = "id",
                    childColumns = "prova_id", onUpdate = CASCADE, onDelete = CASCADE)})
public class AlunoProva {

    private int aluno_id;
    private int prova_id;

    public AlunoProva(){}

    //CONSTRUTOR DE CÓPIA
    public AlunoProva(AlunoProva tbAlunoProva){
        this.aluno_id = tbAlunoProva.getAluno_id();
        this.prova_id = tbAlunoProva.getProva_id();
    }

    public int getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getProva_id() {
        return prova_id;
    }

    public void setProva_id(int prova_id) {
        this.prova_id = prova_id;
    }
}

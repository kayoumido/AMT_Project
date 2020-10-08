package underflowers.stackunderflow.domain.question;

import underflowers.stackunderflow.application.question.QuestionsQuery;
import underflowers.stackunderflow.domain.IRepository;
import underflowers.stackunderflow.domain.user.UserId;

import java.util.Collection;

public interface IQuestionRepository extends IRepository<Question, QuestionId> {
    public Collection<Question> find(QuestionsQuery query);
}

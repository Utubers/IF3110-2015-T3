
package stackexchange.webservice;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnswerWS", targetNamespace = "http://webservice.stackexchange/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnswerWS {


    /**
     * 
     * @param questionId
     * @return
     *     returns java.util.List<stackexchange.webservice.Answer>
     */
    @WebMethod(operationName = "getAnswers_1")
    @WebResult(name = "Answer", targetNamespace = "")
    @RequestWrapper(localName = "getAnswers_1", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.GetAnswers1")
    @ResponseWrapper(localName = "getAnswers_1Response", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.GetAnswers1Response")
    @Action(input = "http://webservice.stackexchange/AnswerWS/getAnswers_1Request", output = "http://webservice.stackexchange/AnswerWS/getAnswers_1Response")
    public List<Answer> getAnswers1(
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId);

    /**
     * 
     * @return
     *     returns java.util.List<stackexchange.webservice.Answer>
     */
    @WebMethod
    @WebResult(name = "Answer", targetNamespace = "")
    @RequestWrapper(localName = "getAnswers", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.GetAnswers")
    @ResponseWrapper(localName = "getAnswersResponse", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.GetAnswersResponse")
    @Action(input = "http://webservice.stackexchange/AnswerWS/getAnswersRequest", output = "http://webservice.stackexchange/AnswerWS/getAnswersResponse")
    public List<Answer> getAnswers();

    /**
     * 
     * @param answer
     * @param token
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addAnswer", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.AddAnswer")
    @Action(input = "http://webservice.stackexchange/AnswerWS/addAnswer")
    public void addAnswer(
        @WebParam(name = "answer", targetNamespace = "")
        Answer answer,
        @WebParam(name = "token", targetNamespace = "")
        String token);

    /**
     * 
     * @param questionId
     * @param id
     * @param email
     * @param token
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "deleteAnswer", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.DeleteAnswer")
    @Action(input = "http://webservice.stackexchange/AnswerWS/deleteAnswer")
    public void deleteAnswer(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "token", targetNamespace = "")
        String token);

    /**
     * 
     * @param answer
     * @param inc
     * @param token
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "voteAnswer", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.VoteAnswer")
    @Action(input = "http://webservice.stackexchange/AnswerWS/voteAnswer")
    public void voteAnswer(
        @WebParam(name = "answer", targetNamespace = "")
        Answer answer,
        @WebParam(name = "inc", targetNamespace = "")
        boolean inc,
        @WebParam(name = "token", targetNamespace = "")
        String token);

    /**
     * 
     * @param questionId
     * @param id
     * @param email
     * @param inc
     * @param token
     */
    @WebMethod(operationName = "voteAnswer_1")
    @Oneway
    @RequestWrapper(localName = "voteAnswer_1", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.VoteAnswer1")
    @Action(input = "http://webservice.stackexchange/AnswerWS/voteAnswer_1")
    public void voteAnswer1(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "questionId", targetNamespace = "")
        int questionId,
        @WebParam(name = "inc", targetNamespace = "")
        boolean inc,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "token", targetNamespace = "")
        String token);

    /**
     * 
     * @param answer
     * @param token
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateAnswer", targetNamespace = "http://webservice.stackexchange/", className = "stackexchange.webservice.UpdateAnswer")
    @Action(input = "http://webservice.stackexchange/AnswerWS/updateAnswer")
    public void updateAnswer(
        @WebParam(name = "answer", targetNamespace = "")
        Answer answer,
        @WebParam(name = "token", targetNamespace = "")
        String token);

}

package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.plaid.client.response.MfaResponse.DeviceChoiceMfaResponse;
import com.plaid.client.response.MfaResponse.DeviceListMfaResponse;
import com.plaid.client.response.MfaResponse.QuestionsMfaResponse;
import com.plaid.client.response.MfaResponse.SelectionsMfaResponse;

@JsonTypeInfo(  
        use         = JsonTypeInfo.Id.NAME,  
        include     = JsonTypeInfo.As.PROPERTY,  
        property    = "type")  
@JsonSubTypes({  
        @Type(value = DeviceChoiceMfaResponse.class,    name = MfaResponse.DEVICE),  
        @Type(value = DeviceListMfaResponse.class,      name = MfaResponse.LIST),
        @Type(value = QuestionsMfaResponse.class,       name = MfaResponse.QUESTIONS),
        @Type(value = SelectionsMfaResponse.class,		name = MfaResponse.SELECTIONS)}) 
public class MfaResponse extends PlaidUserResponse {

    public final static String DEVICE = "device";
    public final static String LIST = "list";
    public final static String QUESTIONS = "questions";
    public final static String SELECTIONS = "selections";
    
    protected String type;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public final static class DeviceChoiceMfaResponse extends MfaResponse {
        
        private Message deviceChoiceSentMessage;
        
        @JsonProperty("mfa")
        public Message getDeviceChoiceSentMessage() {
            return deviceChoiceSentMessage;
        }
        
        public void setDeviceChoiceSentMessage(Message deviceChoiceSentMessage) {
            this.deviceChoiceSentMessage = deviceChoiceSentMessage;
        }
    }
    
    public final static class QuestionsMfaResponse extends MfaResponse {
        
        private Question[] questions;
        
        @JsonProperty("mfa")
        public Question[] getQuestions() {
            return questions;
        }
        
        public void setQuestions(Question[] questions) {
            this.questions = questions;
        }
    }
    
    public final static class SelectionsMfaResponse extends MfaResponse {
    	
    	private Selection[] selections;
    	
    	@JsonProperty("mfa")
    	private Selection[] getSelections() {
    		return selections;
    	}
    	
    	public void setSelections(Selection[] selections) {
			this.selections = selections;
		}
    }
    
    public final static class DeviceListMfaResponse extends MfaResponse {
        
        private DeviceType[] deviceTypes;
        
        @JsonProperty("mfa")
        public DeviceType[] getDeviceTypes() {
            return deviceTypes;
        }
        
        public void setDeviceTypes(DeviceType[] deviceTypes) {
            this.deviceTypes = deviceTypes;
        }
        
    }
    
    public final static class Message {
        private String message;
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
    
    public final static class Question {
        private String question;
        
        public String getQuestion() {
            return question;
        }
        
        public void setQuestion(String question) {
            this.question = question;
        }
    }
    
    public final static class Selection {
    	private String question;
    	private String[] answers;
    	
    	public String[] getAnswers() {
			return answers;
		}
    	
    	public String getQuestion() {
			return question;
		}
    	
    	public void setAnswers(String[] answers) {
			this.answers = answers;
		}
    	
    	public void setQuestion(String question) {
			this.question = question;
		}
    }
    
    public final static class DeviceType {
        private String mask;
        private String type;
        
        public String getMask() {
            return mask;
        }
        
        public void setMask(String mask) {
            this.mask = mask;
        }
        
        public String getType() {
            return type;
        }
        
        public void setType(String type) {
            this.type = type;
        }
    }
}

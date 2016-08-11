package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.plaid.client.response.MfaResponse.DeviceChoiceMfaResponse;
import com.plaid.client.response.MfaResponse.DeviceListMfaResponse;
import com.plaid.client.response.MfaResponse.QuestionsMfaResponse;
import com.plaid.client.response.MfaResponse.SelectionsMfaResponse;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(  
        use         = JsonTypeInfo.Id.NAME,  
        include     = JsonTypeInfo.As.PROPERTY,  
        property    = "type")  
@JsonSubTypes({  
        @Type(value = DeviceChoiceMfaResponse.class,    name = MfaResponse.DEVICE),  
        @Type(value = DeviceListMfaResponse.class,      name = MfaResponse.LIST),
        @Type(value = QuestionsMfaResponse.class,       name = MfaResponse.QUESTIONS),
        @Type(value = SelectionsMfaResponse.class,		name = MfaResponse.SELECTIONS)}) 
public abstract class MfaResponse extends PlaidUserResponse {

    public final static String DEVICE = "device";
    public final static String LIST = "list";
    public final static String QUESTIONS = "questions";
    public final static String SELECTIONS = "selections";
    
    protected String type;

    public abstract String getType();

    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class DeviceChoiceMfaResponse extends MfaResponse {
        
        private Message deviceChoiceSentMessage;
        
        @JsonProperty("mfa")
        public Message getDeviceChoiceSentMessage() {
            return deviceChoiceSentMessage;
        }
        
        public void setDeviceChoiceSentMessage(Message deviceChoiceSentMessage) {
            this.deviceChoiceSentMessage = deviceChoiceSentMessage;
        }
        
        @Override
        public String getType() {
        	return DEVICE;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class QuestionsMfaResponse extends MfaResponse {
        
        private Question[] questions;
        
        @JsonProperty("mfa")
        public Question[] getQuestions() {
            return questions;
        }
        
        public void setQuestions(Question[] questions) {
            this.questions = questions;
        }
        
        @Override
        public String getType() {
        	return QUESTIONS;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class SelectionsMfaResponse extends MfaResponse {
    	
    	private Selection[] selections;
    	
    	@JsonProperty("mfa")
    	public Selection[] getSelections() {
    		return selections;
    	}
    	
    	public void setSelections(Selection[] selections) {
			this.selections = selections;
		}
    	
        @Override
        public String getType() {
        	return SELECTIONS;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class DeviceListMfaResponse extends MfaResponse {
        
        private DeviceType[] deviceTypes;
        
        @JsonProperty("mfa")
        public DeviceType[] getDeviceTypes() {
            return deviceTypes;
        }
        
        public void setDeviceTypes(DeviceType[] deviceTypes) {
            this.deviceTypes = deviceTypes;
        }
        
        @Override
        public String getType() {
        	return LIST;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Message implements Serializable{
        private String message;
        
        public String getMessage() {
            return message;
        }
        
        public void setMessage(String message) {
            this.message = message;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Question implements Serializable {
        private String question;
        
        public String getQuestion() {
            return question;
        }
        
        public void setQuestion(String question) {
            this.question = question;
        }
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Selection implements Serializable {
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
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class DeviceType implements Serializable {
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

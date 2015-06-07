package com.plaid.client.response;

import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Transaction {
    
    private String id;
    private String accountId;
    private String entityId;
    private String categoryId;
    private String pendingTransactionId;
    
    private String name;
    private List<String> category;
    private Double amount;
    private LocalDate date;
    private Map<String, String> type;
    
    private Score score;
    private TransactionMeta meta;
    
    private Boolean pending;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("_account")
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    @JsonProperty("_entity")
    public String getEntityId() {
        return entityId;
    }
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    @JsonProperty("_pendingTransaction")
    public String getPendingTransactionId() {
		return pendingTransactionId;
	}
    public void setPendingTransactionId(String pendingTransactionId) {
		this.pendingTransactionId = pendingTransactionId;
	}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getCategory() {
        return category;
    }
    public void setCategory(List<String> category) {
        this.category = category;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @JsonDeserialize(using=LocalDateDeserializer.class)
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Map<String, String> getType() {
        return type;
    }
    public void setType(Map<String, String> type) {
        this.type = type;
    }
    public Score getScore() {
        return score;
    }
    public void setScore(Score score) {
        this.score = score;
    }
    public TransactionMeta getMeta() {
        return meta;
    }
    public void setMeta(TransactionMeta meta) {
        this.meta = meta;
    }
    public Boolean isPending() {
		return pending;
	}
    public void setPending(Boolean pending) {
		this.pending = pending;
	}

    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Score {
        private Double master;
        private Map<String, Double> detail;
 
        public Double getMaster() {
            return master;
        }
        public void setMaster(Double master) {
            this.master = master;
        }
        public Map<String, Double> getDetail() {
            return detail;
        }
        public void setDetail(Map<String, Double> detail) {
            this.detail = detail;
        }        
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class TransactionMeta {
        private Location location;
        private Map<String, String> contact;
        private Map<String, String> ids;

        public Location getLocation() {
            return location;
        }
        public void setLocation(Location location) {
            this.location = location;
        }
        public Map<String, String> getContact() {
            return contact;
        }
        public void setContact(Map<String, String> contact) {
            this.contact = contact;
        }
        public Map<String, String> getIds() {
            return ids;
        }
        public void setIds(Map<String, String> ids) {
            this.ids = ids;
        }        
    }
    
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Location {
        private Coordinates coordinates;
        private String zip;
        private String state;
        private String city;
        private String address;

        public Coordinates getCoordinates() {
            return coordinates;
        }
        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
    }
        
    @JsonIgnoreProperties(ignoreUnknown=true)
    public final static class Coordinates {
        private Double longitude;
        private Double latitude;

        @JsonProperty("lon")
        public Double getLongitude() {
            return longitude;
        }
        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
        @JsonProperty("lat")
        public Double getLatitude() {
            return latitude;
        }
        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }        
    }
    
}

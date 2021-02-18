package info.caprese.macaroni.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PastaRenponse {
    private String result;
    private String date;
    private String pastaName;
    private  String description;
    private String comment;
    private String errorMsg;
}
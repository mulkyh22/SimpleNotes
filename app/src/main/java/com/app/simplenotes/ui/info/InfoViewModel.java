package com.app.simplenotes.ui.info;

import androidx.lifecycle.ViewModel;

public class InfoViewModel extends ViewModel {
    private String title;
    private String description;
    private String additionalDescription;

    public InfoViewModel() {
        title = "";
        description = "";
        additionalDescription = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }
}

//Signature :
//10120146 - Irshal Mulky H - IF4
package com.redhat.cajun.navy.alert;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlertsController {

    @RequestMapping("/alerts")
    public List<Alert> alerts() {

        ArrayList<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert(AlertType.DANGER, "Severe weather alert!"));
        alerts.add(new Alert(AlertType.SUCCESS, "Successfully increased the priority of the selected area."));
        alerts.add(new Alert(AlertType.INFO, "17 boats are responding to the newly prioritized area."));

        return alerts;
    }

}

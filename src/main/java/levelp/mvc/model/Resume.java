package levelp.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by d.tyufanov on 08.11.2014.
 */
public class Resume {
    PersonalData personalData = new PersonalData();
    ProfessionData professionData = new ProfessionData();
    List<EducationDescription> education = new ArrayList<EducationDescription>();
    List<WorkDescription> experience = new ArrayList<WorkDescription>();
}

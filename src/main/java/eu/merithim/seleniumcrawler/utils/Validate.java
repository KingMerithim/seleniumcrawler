package eu.merithim.seleniumcrawler.utils;

/**
 * Created by Merithim on 27.03.2017.
 */
public @interface Validate {


    Class<? extends ValidateWebsite>[] validate() default { };
}

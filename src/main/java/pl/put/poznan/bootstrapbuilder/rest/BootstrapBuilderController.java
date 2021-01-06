package pl.put.poznan.bootstrapbuilder.rest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.bootstrapbuilder.logic.BootstrapBuilder;
import pl.put.poznan.bootstrapbuilder.logic.Director;
import pl.put.poznan.bootstrapbuilder.logic.Header;

import java.util.Arrays;


@RestController
@RequestMapping("/bootstrap-builder")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

//    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
//    public String get(@PathVariable String text,
//                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {
//        logger.debug(text);
//        logger.debug(Arrays.toString(transforms));
//        // perform the transformation, you should run your logic here, below is just a silly example
//        BootstrapBuilder transformer = new BootstrapBuilder();
//        return "";
//    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@RequestBody Request request) {

        // log the parameters
        logger.debug(String.valueOf(request));
        logger.info("Received request: ");
        logger.info("Header: " + request.getHeader().toString());
        logger.info("Footer: " + request.getFooter().toString());
        logger.info("Meta tags: " + request.getTag().toString());

        return Director.create(request.getTag(), request.getHeader(), request.getFooter());
    }

}



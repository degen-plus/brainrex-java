/*
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package brainrex;

import invalidPackageName.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.TimeSeries;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnomalyApi
 */
@Ignore
public class AnomalyApiTest {

    private final AnomalyApi api = new AnomalyApi();

    
    /**
     * Detects anomalies in historical data in batches. This endpoint uses your entire dataset as input
     *
     * The Anomaly Detect endpoint ingests time series data of all types, then monitors and detects abnormalities historical time series data. &lt;br&gt;&lt;br&gt; Our AI selects from several models, choosing the one that fits the given data best, and we give you the avality to customize the sensitivy of the model. Our model has been trained to recognize anomalies in popular blockchain networks e.g. Bitcoin, Ethereum, learning from past events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void anomalyBatchTest() throws ApiException {
        TimeSeries request = null;
        List<Boolean> response = api.anomalyBatch(request);

        // TODO: test validations
    }
    
}

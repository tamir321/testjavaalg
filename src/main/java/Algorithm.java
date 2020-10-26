import com.google.gson.Gson;
import hkube.algo.wrapper.IAlgorithm;
import hkube.api.IHKubeAPI;
import hkube.api.INode;
import org.json.JSONObject;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class Algorithm implements IAlgorithm {

    @Override
    public void Init(Map args) {

    }


    @Override
    public Object Start(Map args, IHKubeAPI hkubeAPI) throws Exception {
          Gson gson = new Gson();

        Collection<Integer> input = (Collection<Integer>)args.get("input");

        INode node = new INode() {
            @Override
            public String getName() {
                return "yellow-alg-NOde";
            }

            @Override
            public JSONObject[] getInput() {
                return new JSONObject[0];
            }

            @Override
            public void setInput(JSONObject[] input) {

            }
            @Override
            public String getAlgorithmName() {
                return "yellow-alg";
            }

            @Override
            public void setAlgorithmName(String algorithmName) {

            }
        };


        return input;
    }






    @Override
    public void Stop() {

    }

    @Override
    public void Cleanup() {

    }

}

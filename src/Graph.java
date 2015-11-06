import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Jiri Caga on 5.11.15.
 */
public interface Graph {

    void addEdge(int vertex1, int vertex2);

    int calculateMinDegreeVertex();

    int calculateMaxDegreeVertex();

    float calculateAverageDegreeVertex();
}

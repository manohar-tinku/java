package basics.project.toto;

import basics.project.toto.data.FileBasedDataStore;
import basics.project.toto.domain.Statistics;
import basics.project.toto.service.TotoService;

public class App {

    public static final String FILE_PATH = "C:\\Users\\Manohar_Mittapally\\Desktop\\Java-Training\\java\\Java\\src\\main\\resources\\toto.csv";
    public static final String PRIZE_MESSAGE = "The largest prize ever recorded: ";
    public static final String FT = " Ft";
    public static final String STATISTICS_TEAM_1_WON = "Statistics: team #1 won: ";
    public static final String TEAM_2_WON = " %, team #2 won: ";
    public static final String DRAW = " %, draw: ";
    public static final String TWO_DECIMAL_POINT = "%.2f";

    public static void main(String[] args) {
        FileBasedDataStore fileBasedDataStore = new FileBasedDataStore();
        fileBasedDataStore.init(FILE_PATH);
        TotoService totoService = new TotoService(fileBasedDataStore);
        System.out.println(PRIZE_MESSAGE + totoService.getLargestPrize() + FT);
        Statistics statistics = totoService.calculateStatistics();
        System.out.println(STATISTICS_TEAM_1_WON + String.format(TWO_DECIMAL_POINT, statistics.getFirstTeamWinPercentage()) +
                TEAM_2_WON +
                String.format(TWO_DECIMAL_POINT, statistics.getSecondTeamWinPercentage()) +
                DRAW +
                String.format(TWO_DECIMAL_POINT, statistics.getDrawPercentage()) + " %");
    }
}

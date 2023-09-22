import net.pricefx.server.dto.calculation.ResultHighchart

Map container = [chart        : [plotBackgroundColor: null,

                                 plotBorderWidth    : null,
                                 plotShadow         : false,
                                 type               : 'pie',],
                 title        : [text: 'Result ',],
                 tooltip      : [pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'],
                 accessibility: [point: [valueSuffix: '%',]],
                 plotOptions  : [pie: [allowPointSelect: true,
                                       cursor          : 'pointer',
                                       dataLabels      : [enabled: true,
                                                          format : '<b>{point.name}</b>: {point.percentage:.1f} %']]],
                 series       : [[name        : 'Product Sku',
                                  colorByPoint: true,
                                  data        : out.PieChartData,
                                 ],
                 ],
]

ResultHighchart chart = api.buildHighchart(container)

return chart

/*chart.onPointClick().triggerEvent(api.dashboardWideEvent("event"))
        .withXAsEventDataAttr()*/
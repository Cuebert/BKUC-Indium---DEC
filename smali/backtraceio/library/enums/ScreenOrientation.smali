.class public final enum Lbacktraceio/library/enums/ScreenOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/ScreenOrientation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/ScreenOrientation;

.field public static final enum LANDSCAPE:Lbacktraceio/library/enums/ScreenOrientation;

.field public static final enum PORTRAIT:Lbacktraceio/library/enums/ScreenOrientation;

.field public static final enum UNDEFINED:Lbacktraceio/library/enums/ScreenOrientation;


# instance fields
.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lbacktraceio/library/enums/ScreenOrientation;

    const-string v1, "PORTRAIT"

    const/4 v2, 0x0

    const-string v3, "Portrait"

    invoke-direct {v0, v1, v2, v3}, Lbacktraceio/library/enums/ScreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/ScreenOrientation;->PORTRAIT:Lbacktraceio/library/enums/ScreenOrientation;

    .line 2
    new-instance v1, Lbacktraceio/library/enums/ScreenOrientation;

    const-string v3, "LANDSCAPE"

    const/4 v4, 0x1

    const-string v5, "Landscape"

    invoke-direct {v1, v3, v4, v5}, Lbacktraceio/library/enums/ScreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lbacktraceio/library/enums/ScreenOrientation;->LANDSCAPE:Lbacktraceio/library/enums/ScreenOrientation;

    .line 3
    new-instance v3, Lbacktraceio/library/enums/ScreenOrientation;

    const-string v5, "UNDEFINED"

    const/4 v6, 0x2

    const-string v7, "Unknown"

    invoke-direct {v3, v5, v6, v7}, Lbacktraceio/library/enums/ScreenOrientation;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lbacktraceio/library/enums/ScreenOrientation;->UNDEFINED:Lbacktraceio/library/enums/ScreenOrientation;

    const/4 v5, 0x3

    new-array v5, v5, [Lbacktraceio/library/enums/ScreenOrientation;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lbacktraceio/library/enums/ScreenOrientation;->$VALUES:[Lbacktraceio/library/enums/ScreenOrientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lbacktraceio/library/enums/ScreenOrientation;->text:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/ScreenOrientation;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/ScreenOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/ScreenOrientation;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/ScreenOrientation;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->$VALUES:[Lbacktraceio/library/enums/ScreenOrientation;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/ScreenOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/enums/ScreenOrientation;->text:Ljava/lang/String;

    return-object v0
.end method

.class public final enum Lbacktraceio/library/enums/NfcStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbacktraceio/library/enums/NfcStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbacktraceio/library/enums/NfcStatus;

.field public static final enum DISABLED:Lbacktraceio/library/enums/NfcStatus;

.field public static final enum ENABLED:Lbacktraceio/library/enums/NfcStatus;

.field public static final enum NOT_AVAILABLE:Lbacktraceio/library/enums/NfcStatus;


# instance fields
.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lbacktraceio/library/enums/NfcStatus;

    const-string v1, "NOT_AVAILABLE"

    const/4 v2, 0x0

    const-string v3, "NotAvailable"

    invoke-direct {v0, v1, v2, v3}, Lbacktraceio/library/enums/NfcStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbacktraceio/library/enums/NfcStatus;->NOT_AVAILABLE:Lbacktraceio/library/enums/NfcStatus;

    .line 2
    new-instance v1, Lbacktraceio/library/enums/NfcStatus;

    const-string v3, "DISABLED"

    const/4 v4, 0x1

    const-string v5, "Disabled"

    invoke-direct {v1, v3, v4, v5}, Lbacktraceio/library/enums/NfcStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lbacktraceio/library/enums/NfcStatus;->DISABLED:Lbacktraceio/library/enums/NfcStatus;

    .line 3
    new-instance v3, Lbacktraceio/library/enums/NfcStatus;

    const-string v5, "ENABLED"

    const/4 v6, 0x2

    const-string v7, "Enabled"

    invoke-direct {v3, v5, v6, v7}, Lbacktraceio/library/enums/NfcStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lbacktraceio/library/enums/NfcStatus;->ENABLED:Lbacktraceio/library/enums/NfcStatus;

    const/4 v5, 0x3

    new-array v5, v5, [Lbacktraceio/library/enums/NfcStatus;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lbacktraceio/library/enums/NfcStatus;->$VALUES:[Lbacktraceio/library/enums/NfcStatus;

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
    iput-object p3, p0, Lbacktraceio/library/enums/NfcStatus;->text:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbacktraceio/library/enums/NfcStatus;
    .locals 1

    const-class v0, Lbacktraceio/library/enums/NfcStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/enums/NfcStatus;

    return-object p0
.end method

.method public static values()[Lbacktraceio/library/enums/NfcStatus;
    .locals 1

    sget-object v0, Lbacktraceio/library/enums/NfcStatus;->$VALUES:[Lbacktraceio/library/enums/NfcStatus;

    invoke-virtual {v0}, [Lbacktraceio/library/enums/NfcStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbacktraceio/library/enums/NfcStatus;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/enums/NfcStatus;->text:Ljava/lang/String;

    return-object v0
.end method

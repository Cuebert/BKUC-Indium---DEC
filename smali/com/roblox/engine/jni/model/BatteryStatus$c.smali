.class public final enum Lcom/roblox/engine/jni/model/BatteryStatus$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/BatteryStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/model/BatteryStatus$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

.field public static final enum DISCHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

.field public static final enum FULL:Lcom/roblox/engine/jni/model/BatteryStatus$c;

.field public static final enum NOT_CHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

.field public static final enum UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$c;

.field private static final synthetic n:[Lcom/roblox/engine/jni/model/BatteryStatus$c;


# instance fields
.field public final androidValue:I

.field public final robloxValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    .line 2
    new-instance v1, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    const-string v4, "CHARGING"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5, v5}, Lcom/roblox/engine/jni/model/BatteryStatus$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, Lcom/roblox/engine/jni/model/BatteryStatus$c;->CHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    .line 3
    new-instance v4, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    const-string v6, "DISCHARGING"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7, v7}, Lcom/roblox/engine/jni/model/BatteryStatus$c;-><init>(Ljava/lang/String;III)V

    sput-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$c;->DISCHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    .line 4
    new-instance v6, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    const-string v8, "NOT_CHARGING"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9, v9}, Lcom/roblox/engine/jni/model/BatteryStatus$c;-><init>(Ljava/lang/String;III)V

    sput-object v6, Lcom/roblox/engine/jni/model/BatteryStatus$c;->NOT_CHARGING:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    .line 5
    new-instance v8, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    const-string v10, "FULL"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11, v11}, Lcom/roblox/engine/jni/model/BatteryStatus$c;-><init>(Ljava/lang/String;III)V

    sput-object v8, Lcom/roblox/engine/jni/model/BatteryStatus$c;->FULL:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    new-array v10, v11, [Lcom/roblox/engine/jni/model/BatteryStatus$c;

    aput-object v0, v10, v2

    aput-object v1, v10, v3

    aput-object v4, v10, v5

    aput-object v6, v10, v7

    aput-object v8, v10, v9

    .line 6
    sput-object v10, Lcom/roblox/engine/jni/model/BatteryStatus$c;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->robloxValue:I

    .line 3
    iput p4, p0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->androidValue:I

    return-void
.end method

.method public static b(Ljava/lang/Integer;)Lcom/roblox/engine/jni/model/BatteryStatus$c;
    .locals 6

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    return-object p0

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$c;->values()[Lcom/roblox/engine/jni/model/BatteryStatus$c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 3
    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$c;->androidValue:I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/model/BatteryStatus$c;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/model/BatteryStatus$c;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/model/BatteryStatus$c;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$c;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$c;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/model/BatteryStatus$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/model/BatteryStatus$c;

    return-object v0
.end method

.class public final enum Lcom/roblox/engine/jni/model/BatteryStatus$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/BatteryStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/model/BatteryStatus$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum COLD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum DEAD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum GOOD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum OVERHEAT:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum OVER_VOLTAGE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field public static final enum UNSPECFIED_FAILURE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

.field private static final synthetic n:[Lcom/roblox/engine/jni/model/BatteryStatus$a;


# instance fields
.field public final androidValue:I

.field public final robloxValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v2, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 2
    new-instance v1, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v4, "GOOD"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v3, v5}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v1, Lcom/roblox/engine/jni/model/BatteryStatus$a;->GOOD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 3
    new-instance v4, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v6, "OVERHEAT"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v5, v7}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v4, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVERHEAT:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 4
    new-instance v6, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v8, "DEAD"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v7, v9}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v6, Lcom/roblox/engine/jni/model/BatteryStatus$a;->DEAD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 5
    new-instance v8, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v10, "OVER_VOLTAGE"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v9, v11}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v8, Lcom/roblox/engine/jni/model/BatteryStatus$a;->OVER_VOLTAGE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 6
    new-instance v10, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v12, "UNSPECFIED_FAILURE"

    const/4 v13, 0x6

    invoke-direct {v10, v12, v11, v11, v13}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v10, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNSPECFIED_FAILURE:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    .line 7
    new-instance v12, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    const-string v14, "COLD"

    const/4 v15, 0x7

    invoke-direct {v12, v14, v13, v13, v15}, Lcom/roblox/engine/jni/model/BatteryStatus$a;-><init>(Ljava/lang/String;III)V

    sput-object v12, Lcom/roblox/engine/jni/model/BatteryStatus$a;->COLD:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    new-array v14, v15, [Lcom/roblox/engine/jni/model/BatteryStatus$a;

    aput-object v0, v14, v2

    aput-object v1, v14, v3

    aput-object v4, v14, v5

    aput-object v6, v14, v7

    aput-object v8, v14, v9

    aput-object v10, v14, v11

    aput-object v12, v14, v13

    .line 8
    sput-object v14, Lcom/roblox/engine/jni/model/BatteryStatus$a;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$a;

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
    iput p3, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    .line 3
    iput p4, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->androidValue:I

    return-void
.end method

.method public static b(Ljava/lang/Integer;)I
    .locals 6

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    iget p0, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0

    .line 2
    :cond_0
    invoke-static {}, Lcom/roblox/engine/jni/model/BatteryStatus$a;->values()[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 3
    iget v4, v3, Lcom/roblox/engine/jni/model/BatteryStatus$a;->androidValue:I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    iget p0, v3, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    sget-object p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$a;

    iget p0, p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->robloxValue:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/model/BatteryStatus$a;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/model/BatteryStatus$a;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/model/BatteryStatus$a;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$a;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$a;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/model/BatteryStatus$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/model/BatteryStatus$a;

    return-object v0
.end method

.class public final enum Lcom/roblox/audio/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/audio/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/audio/a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/roblox/audio/a$a;

.field public static final enum o:Lcom/roblox/audio/a$a;

.field public static final enum p:Lcom/roblox/audio/a$a;

.field public static final enum q:Lcom/roblox/audio/a$a;

.field public static final enum r:Lcom/roblox/audio/a$a;

.field private static final synthetic s:[Lcom/roblox/audio/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/roblox/audio/a$a;

    const-string v1, "SPEAKER_PHONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/audio/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/audio/a$a;->n:Lcom/roblox/audio/a$a;

    new-instance v1, Lcom/roblox/audio/a$a;

    const-string v3, "WIRED_HEADSET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/roblox/audio/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/roblox/audio/a$a;->o:Lcom/roblox/audio/a$a;

    new-instance v3, Lcom/roblox/audio/a$a;

    const-string v5, "EARPIECE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/roblox/audio/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/roblox/audio/a$a;->p:Lcom/roblox/audio/a$a;

    new-instance v5, Lcom/roblox/audio/a$a;

    const-string v7, "BLUETOOTH"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/roblox/audio/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/roblox/audio/a$a;->q:Lcom/roblox/audio/a$a;

    new-instance v7, Lcom/roblox/audio/a$a;

    const-string v9, "NONE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/roblox/audio/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/roblox/audio/a$a;->r:Lcom/roblox/audio/a$a;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/roblox/audio/a$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/roblox/audio/a$a;->s:[Lcom/roblox/audio/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/audio/a$a;
    .locals 1

    const-class v0, Lcom/roblox/audio/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/audio/a$a;

    return-object p0
.end method

.method public static values()[Lcom/roblox/audio/a$a;
    .locals 1

    sget-object v0, Lcom/roblox/audio/a$a;->s:[Lcom/roblox/audio/a$a;

    invoke-virtual {v0}, [Lcom/roblox/audio/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/audio/a$a;

    return-object v0
.end method

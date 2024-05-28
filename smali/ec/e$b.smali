.class public final enum Lec/e$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lec/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lec/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lec/e$b;

.field public static final enum o:Lec/e$b;

.field public static final enum p:Lec/e$b;

.field public static final enum q:Lec/e$b;

.field public static final enum r:Lec/e$b;

.field private static final synthetic s:[Lec/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lec/e$b;

    const-string v1, "SPEAKER_PHONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lec/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lec/e$b;->n:Lec/e$b;

    new-instance v1, Lec/e$b;

    const-string v3, "WIRED_HEADSET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lec/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lec/e$b;->o:Lec/e$b;

    new-instance v3, Lec/e$b;

    const-string v5, "EARPIECE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lec/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lec/e$b;->p:Lec/e$b;

    new-instance v5, Lec/e$b;

    const-string v7, "BLUETOOTH"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lec/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lec/e$b;->q:Lec/e$b;

    new-instance v7, Lec/e$b;

    const-string v9, "NONE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lec/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lec/e$b;->r:Lec/e$b;

    const/4 v9, 0x5

    new-array v9, v9, [Lec/e$b;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lec/e$b;->s:[Lec/e$b;

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

.method public static valueOf(Ljava/lang/String;)Lec/e$b;
    .locals 1

    const-class v0, Lec/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lec/e$b;

    return-object p0
.end method

.method public static values()[Lec/e$b;
    .locals 1

    sget-object v0, Lec/e$b;->s:[Lec/e$b;

    invoke-virtual {v0}, [Lec/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lec/e$b;

    return-object v0
.end method

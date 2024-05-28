.class public final enum Lqa/t$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/t$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lqa/t$f;

.field public static final enum o:Lqa/t$f;

.field public static final enum p:Lqa/t$f;

.field private static final synthetic q:[Lqa/t$f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lqa/t$f;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqa/t$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqa/t$f;->n:Lqa/t$f;

    .line 2
    new-instance v1, Lqa/t$f;

    const-string v3, "NORMAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqa/t$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqa/t$f;->o:Lqa/t$f;

    .line 3
    new-instance v3, Lqa/t$f;

    const-string v5, "HIGH"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqa/t$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqa/t$f;->p:Lqa/t$f;

    const/4 v5, 0x3

    new-array v5, v5, [Lqa/t$f;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lqa/t$f;->q:[Lqa/t$f;

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

.method public static valueOf(Ljava/lang/String;)Lqa/t$f;
    .locals 1

    const-class v0, Lqa/t$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/t$f;

    return-object p0
.end method

.method public static values()[Lqa/t$f;
    .locals 1

    sget-object v0, Lqa/t$f;->q:[Lqa/t$f;

    invoke-virtual {v0}, [Lqa/t$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/t$f;

    return-object v0
.end method

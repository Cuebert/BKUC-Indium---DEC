.class final enum Lx/g$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx/g$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lx/g$c;

.field public static final enum o:Lx/g$c;

.field public static final enum p:Lx/g$c;

.field public static final enum q:Lx/g$c;

.field private static final synthetic r:[Lx/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lx/g$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx/g$c;->n:Lx/g$c;

    .line 2
    new-instance v1, Lx/g$c;

    const-string v3, "QUEUING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lx/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx/g$c;->o:Lx/g$c;

    .line 3
    new-instance v3, Lx/g$c;

    const-string v5, "QUEUED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lx/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lx/g$c;->p:Lx/g$c;

    .line 4
    new-instance v5, Lx/g$c;

    const-string v7, "RUNNING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lx/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lx/g$c;->q:Lx/g$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lx/g$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lx/g$c;->r:[Lx/g$c;

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

.method public static valueOf(Ljava/lang/String;)Lx/g$c;
    .locals 1

    const-class v0, Lx/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx/g$c;

    return-object p0
.end method

.method public static values()[Lx/g$c;
    .locals 1

    sget-object v0, Lx/g$c;->r:[Lx/g$c;

    invoke-virtual {v0}, [Lx/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx/g$c;

    return-object v0
.end method

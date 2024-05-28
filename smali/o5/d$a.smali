.class public final enum Lo5/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo5/d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lo5/d$a;

.field public static final enum o:Lo5/d$a;

.field public static final enum p:Lo5/d$a;

.field private static final synthetic q:[Lo5/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lo5/d$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo5/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo5/d$a;->n:Lo5/d$a;

    .line 2
    new-instance v1, Lo5/d$a;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo5/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo5/d$a;->o:Lo5/d$a;

    .line 3
    new-instance v3, Lo5/d$a;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo5/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo5/d$a;->p:Lo5/d$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lo5/d$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lo5/d$a;->q:[Lo5/d$a;

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

.method public static valueOf(Ljava/lang/String;)Lo5/d$a;
    .locals 1

    const-class v0, Lo5/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo5/d$a;

    return-object p0
.end method

.method public static values()[Lo5/d$a;
    .locals 1

    sget-object v0, Lo5/d$a;->q:[Lo5/d$a;

    invoke-virtual {v0}, [Lo5/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo5/d$a;

    return-object v0
.end method

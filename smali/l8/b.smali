.class public final enum Ll8/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll8/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ll8/b;

.field public static final enum o:Ll8/b;

.field public static final enum p:Ll8/b;

.field private static final synthetic q:[Ll8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ll8/b;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll8/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll8/b;->n:Ll8/b;

    .line 2
    new-instance v1, Ll8/b;

    const-string v3, "user"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll8/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll8/b;->o:Ll8/b;

    .line 3
    new-instance v3, Ll8/b;

    const-string v5, "game"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll8/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll8/b;->p:Ll8/b;

    const/4 v5, 0x3

    new-array v5, v5, [Ll8/b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Ll8/b;->q:[Ll8/b;

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

.method public static valueOf(Ljava/lang/String;)Ll8/b;
    .locals 1

    const-class v0, Ll8/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll8/b;

    return-object p0
.end method

.method public static values()[Ll8/b;
    .locals 1

    sget-object v0, Ll8/b;->q:[Ll8/b;

    invoke-virtual {v0}, [Ll8/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll8/b;

    return-object v0
.end method

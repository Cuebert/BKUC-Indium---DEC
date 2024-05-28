.class public abstract enum Lb6/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb6/u;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lb6/u;

.field public static final enum o:Lb6/u;

.field private static final synthetic p:[Lb6/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lb6/u$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb6/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb6/u;->n:Lb6/u;

    .line 2
    new-instance v1, Lb6/u$b;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb6/u$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb6/u;->o:Lb6/u;

    const/4 v3, 0x2

    new-array v3, v3, [Lb6/u;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lb6/u;->p:[Lb6/u;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILb6/u$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lb6/u;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb6/u;
    .locals 1

    const-class v0, Lb6/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb6/u;

    return-object p0
.end method

.method public static values()[Lb6/u;
    .locals 1

    sget-object v0, Lb6/u;->p:[Lb6/u;

    invoke-virtual {v0}, [Lb6/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb6/u;

    return-object v0
.end method

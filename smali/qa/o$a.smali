.class final enum Lqa/o$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/o$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum q:Lqa/o$a;

.field public static final enum r:Lqa/o$a;

.field public static final enum s:Lqa/o$a;

.field private static final synthetic t:[Lqa/o$a;


# instance fields
.field final n:I

.field final o:I

.field final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v6, Lqa/o$a;

    const-string v1, "MICRO"

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/16 v4, 0x60

    const/16 v5, 0x60

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lqa/o$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v6, Lqa/o$a;->q:Lqa/o$a;

    .line 2
    new-instance v0, Lqa/o$a;

    const-string v8, "MINI"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/16 v11, 0x200

    const/16 v12, 0x180

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lqa/o$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lqa/o$a;->r:Lqa/o$a;

    .line 3
    new-instance v1, Lqa/o$a;

    const-string v14, "FULL"

    const/4 v15, 0x2

    const/16 v16, 0x2

    const/16 v17, -0x1

    const/16 v18, -0x1

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Lqa/o$a;-><init>(Ljava/lang/String;IIII)V

    sput-object v1, Lqa/o$a;->s:Lqa/o$a;

    const/4 v2, 0x3

    new-array v2, v2, [Lqa/o$a;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    .line 4
    sput-object v2, Lqa/o$a;->t:[Lqa/o$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lqa/o$a;->n:I

    .line 3
    iput p4, p0, Lqa/o$a;->o:I

    .line 4
    iput p5, p0, Lqa/o$a;->p:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/o$a;
    .locals 1

    const-class v0, Lqa/o$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/o$a;

    return-object p0
.end method

.method public static values()[Lqa/o$a;
    .locals 1

    sget-object v0, Lqa/o$a;->t:[Lqa/o$a;

    invoke-virtual {v0}, [Lqa/o$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/o$a;

    return-object v0
.end method

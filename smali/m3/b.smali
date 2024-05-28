.class public final enum Lm3/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/fido/fido2/api/common/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm3/b;",
        ">;",
        "Lcom/google/android/gms/fido/fido2/api/common/a;"
    }
.end annotation


# static fields
.field public static final enum o:Lm3/b;

.field public static final enum p:Lm3/b;

.field public static final enum q:Lm3/b;

.field public static final enum r:Lm3/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum s:Lm3/b;

.field public static final enum t:Lm3/b;

.field public static final enum u:Lm3/b;

.field public static final enum v:Lm3/b;

.field private static final synthetic w:[Lm3/b;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lm3/b;

    const-string v1, "RS256"

    const/4 v2, 0x0

    const/16 v3, -0x101

    invoke-direct {v0, v1, v2, v3}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm3/b;->o:Lm3/b;

    new-instance v1, Lm3/b;

    const-string v3, "RS384"

    const/4 v4, 0x1

    const/16 v5, -0x102

    .line 2
    invoke-direct {v1, v3, v4, v5}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lm3/b;->p:Lm3/b;

    new-instance v3, Lm3/b;

    const-string v5, "RS512"

    const/4 v6, 0x2

    const/16 v7, -0x103

    .line 3
    invoke-direct {v3, v5, v6, v7}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lm3/b;->q:Lm3/b;

    new-instance v5, Lm3/b;

    const-string v7, "LEGACY_RS1"

    const/4 v8, 0x3

    const/16 v9, -0x106

    .line 4
    invoke-direct {v5, v7, v8, v9}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lm3/b;->r:Lm3/b;

    new-instance v7, Lm3/b;

    const-string v9, "PS256"

    const/4 v10, 0x4

    const/16 v11, -0x25

    .line 5
    invoke-direct {v7, v9, v10, v11}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lm3/b;->s:Lm3/b;

    new-instance v9, Lm3/b;

    const-string v11, "PS384"

    const/4 v12, 0x5

    const/16 v13, -0x26

    .line 6
    invoke-direct {v9, v11, v12, v13}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lm3/b;->t:Lm3/b;

    new-instance v11, Lm3/b;

    const-string v13, "PS512"

    const/4 v14, 0x6

    const/16 v15, -0x27

    .line 7
    invoke-direct {v11, v13, v14, v15}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lm3/b;->u:Lm3/b;

    new-instance v13, Lm3/b;

    const-string v15, "RS1"

    const/4 v14, 0x7

    const v12, -0xffff

    .line 8
    invoke-direct {v13, v15, v14, v12}, Lm3/b;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lm3/b;->v:Lm3/b;

    const/16 v12, 0x8

    new-array v12, v12, [Lm3/b;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    aput-object v7, v12, v10

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    aput-object v13, v12, v14

    sput-object v12, Lm3/b;->w:[Lm3/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm3/b;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm3/b;
    .locals 1

    const-class v0, Lm3/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm3/b;

    return-object p0
.end method

.method public static values()[Lm3/b;
    .locals 1

    sget-object v0, Lm3/b;->w:[Lm3/b;

    invoke-virtual {v0}, [Lm3/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm3/b;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lm3/b;->n:I

    return v0
.end method

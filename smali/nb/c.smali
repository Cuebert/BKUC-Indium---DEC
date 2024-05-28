.class public final Lnb/c;
.super Lnb/f;
.source "SourceFile"


# static fields
.field public static final v:Lnb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/c;

    invoke-direct {v0}, Lnb/c;-><init>()V

    sput-object v0, Lnb/c;->v:Lnb/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    sget v1, Lnb/l;->c:I

    sget v2, Lnb/l;->d:I

    .line 2
    sget-wide v3, Lnb/l;->e:J

    sget-object v5, Lnb/l;->a:Ljava/lang/String;

    move-object v0, p0

    .line 3
    invoke-direct/range {v0 .. v5}, Lnb/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method

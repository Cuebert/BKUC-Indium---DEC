.class Lqb/d$b;
.super Lqb/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqb/d;->X()Lac/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic p:Lqb/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lqb/d;

    return-void
.end method

.method constructor <init>(Lqb/d;Lac/s;)V
    .locals 0

    iput-object p1, p0, Lqb/d$b;->p:Lqb/d;

    invoke-direct {p0, p2}, Lqb/e;-><init>(Lac/s;)V

    return-void
.end method


# virtual methods
.method protected b(Ljava/io/IOException;)V
    .locals 1

    iget-object p1, p0, Lqb/d$b;->p:Lqb/d;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lqb/d;->z:Z

    return-void
.end method

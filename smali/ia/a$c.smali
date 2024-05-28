.class Lia/a$c;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lia/a;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lia/a;


# direct methods
.method constructor <init>(Lia/a;)V
    .locals 0

    iput-object p1, p0, Lia/a$c;->n:Lia/a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lia/a$c;->n:Lia/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lia/a;->c(Lia/a;Z)Z

    .line 2
    iget-object v0, p0, Lia/a$c;->n:Lia/a;

    invoke-virtual {v0}, Lia/a;->j()V

    return-void
.end method

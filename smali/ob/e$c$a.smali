.class Lob/e$c$a;
.super Lac/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/e$c;-><init>(Lqb/d$e;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lqb/d$e;

.field final synthetic p:Lob/e$c;


# direct methods
.method constructor <init>(Lob/e$c;Lac/t;Lqb/d$e;)V
    .locals 0

    iput-object p1, p0, Lob/e$c$a;->p:Lob/e$c;

    iput-object p3, p0, Lob/e$c$a;->o:Lqb/d$e;

    invoke-direct {p0, p2}, Lac/h;-><init>(Lac/t;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lob/e$c$a;->o:Lqb/d$e;

    invoke-virtual {v0}, Lqb/d$e;->close()V

    .line 2
    invoke-super {p0}, Lac/h;->close()V

    return-void
.end method

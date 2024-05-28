.class public final synthetic Lw3/qa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/g;


# instance fields
.field public final synthetic a:Lw3/ra;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lw3/ra;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/qa;->a:Lw3/ra;

    iput-wide p2, p0, Lw3/qa;->b:J

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lw3/qa;->a:Lw3/ra;

    iget-wide v1, p0, Lw3/qa;->b:J

    invoke-virtual {v0, v1, v2, p1}, Lw3/ra;->b(JLjava/lang/Exception;)V

    return-void
.end method

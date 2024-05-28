.class public final synthetic Lj6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/na;


# instance fields
.field public final synthetic a:Lj6/g;

.field public final synthetic b:J

.field public final synthetic c:Lw3/c8;

.field public final synthetic d:Lw3/y0;

.field public final synthetic e:Lw3/y0;

.field public final synthetic f:Lk6/a;


# direct methods
.method public synthetic constructor <init>(Lj6/g;JLw3/c8;Lw3/y0;Lw3/y0;Lk6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/f;->a:Lj6/g;

    iput-wide p2, p0, Lj6/f;->b:J

    iput-object p4, p0, Lj6/f;->c:Lw3/c8;

    iput-object p5, p0, Lj6/f;->d:Lw3/y0;

    iput-object p6, p0, Lj6/f;->e:Lw3/y0;

    iput-object p7, p0, Lj6/f;->f:Lk6/a;

    return-void
.end method


# virtual methods
.method public final zza()Lw3/sa;
    .locals 7

    iget-object v0, p0, Lj6/f;->a:Lj6/g;

    iget-wide v1, p0, Lj6/f;->b:J

    iget-object v3, p0, Lj6/f;->c:Lw3/c8;

    iget-object v4, p0, Lj6/f;->d:Lw3/y0;

    iget-object v5, p0, Lj6/f;->e:Lw3/y0;

    iget-object v6, p0, Lj6/f;->f:Lk6/a;

    invoke-virtual/range {v0 .. v6}, Lj6/g;->j(JLw3/c8;Lw3/y0;Lw3/y0;Lk6/a;)Lw3/sa;

    move-result-object v0

    return-object v0
.end method

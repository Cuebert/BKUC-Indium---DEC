.class Lbacktraceio/library/models/json/AnnotationException;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private message:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lbacktraceio/library/models/json/AnnotationException;->setMessage(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method setMessage(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/json/AnnotationException;->message:Ljava/lang/Object;

    return-void
.end method
